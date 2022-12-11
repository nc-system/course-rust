
package com.ncsys.springwebjava;
import com.ncsys.springwebjava.models.ModelBooks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Routes {

    // Logger
    private final Logger logger = LoggerFactory.getLogger(Routes.class);

    // GETS
    @GetMapping("/")
    String myFirstRoute() {
        return "Route Root - This is Spring Boot - Spring Web - API Res";
    }

    @GetMapping("/route1")
    String route1() {
        return "Route 1";
    }

    @GetMapping("/route2")
    String route2() {
        return "Route 2";
    }

    @GetMapping("/route-id/{id}")
    String routeID(@PathVariable int id) {
        return "Route ID : " + id;
    }

    @GetMapping("/route-id/{id}/editorial/{edit}")
    String routeIDEdit(@PathVariable int id, @PathVariable String edit) {
        return "Route ID:" + id + ", Editorial: " + edit;
    }

    @GetMapping("/route-params/")
    String routeIDEParams(@RequestParam String params) {
        return "Route Params: " + params;
    }
    @GetMapping("/route-id-params/{id}/")
    String routeIDEParams(@PathVariable int id, @RequestParam String params) {
        return "Route ID: " + id + ", Params: " + params;
    }

    // POST
    @PostMapping("/book")
    String postBook(@RequestBody Map<String, Object> book) {
        book.keySet().forEach(llave -> {
            logger.debug("llave{} valor{}", llave, book.get(llave));
        });
        return "Save Book";
    }

    @PostMapping("/book-model")
    String postBook(@RequestBody ModelBooks book) {
        logger.debug("Name: {} Editorial: {}", book.name , book.editorial);
        return "Save Book";
    }

}
