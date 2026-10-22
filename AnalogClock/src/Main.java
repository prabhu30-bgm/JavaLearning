import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        // Creates an HTTP server on port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Link the URL pathway "/api/time" to our time-handler code
        server.createContext("/api/time", new TimeHandler());

        server.setExecutor(null); // default executor
        System.out.println("Java Clock Server started on http://localhost:8080/api/time");
        server.start();
    }

    static class TimeHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Get current server time formatted
            LocalTime time = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
            String responseTime = time.format(formatter);

            // Crucial: Allow your HTML file to bypass security restrictions (CORS) to read the data
            exchange.getResponseHeaders().set("Access-Control-Allow-Origin", "*");
            exchange.getResponseHeaders().set("Content-Type", "text/plain");

            // Send headers and content back to the browser
            exchange.sendResponseHeaders(200, responseTime.length());
            OutputStream os = exchange.getResponseBody();
            os.write(responseTime.getBytes());
            os.close();
        }
    }
}
