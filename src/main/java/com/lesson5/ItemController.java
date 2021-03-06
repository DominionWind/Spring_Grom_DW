package com.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

@Controller
public class ItemController {

    private ItemDAO dao;

    @Autowired
    public ItemController(ItemDAO dao) {
         this.dao = dao;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hi", produces = "text/plain")
    public @ResponseBody
    String printTestMessage() {
        return "test";
    }

     @RequestMapping(method = RequestMethod.POST, value = "/item/save", produces = "text/plain")
    public @ResponseBody
    String saveItem(HttpServletRequest request) throws IOException {
        dao.save(mapperItem(request));
        return "Item " + mapperItem(request).toString() + " was saved";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/item/delete", produces = "text/plain")
    public @ResponseBody
    void deleteItem(@RequestParam(value = "id") Long id){
        dao.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/item/update", produces = "application/json")
    public @ResponseBody
    String updateItem(HttpServletRequest request) throws IOException {
        dao.update(mapperItem(request));
        return "Item " + mapperItem(request).toString() + " updated";
    }

    private Item mapperItem(HttpServletRequest request) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(httpRequestToString(request), Item.class);
    }

    private String httpRequestToString(HttpServletRequest req) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = req.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
        }
        return sb.toString();
    }
}