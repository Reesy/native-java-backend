package backend;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.*;

public class APIServer {

    public static void main(String[] args) {

        InetSocketAddress openSocket = new InetSocketAddress("localhost", 8001);

        try {
            HttpServer server = HttpServer.create(openSocket, 0);
            server.createContext("/ping", new pingponghandler());
            System.out.println("Listening on port 8001");
            server.start();

        } catch (Exception e) {
            System.out.println("Exception raised: " + e);
        }
        
    }

    static class pingponghandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            byte [] response = "Pong".getBytes();
            exchange.sendResponseHeaders(200, response.length);
            OutputStream os = exchange.getResponseBody();
            os.write(response);
            os.close();
        }
        
    }
}
