package com.travel.travel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

@RestController
public class HotelController {
    private final Hotel[] hotels = { new Hotel(1, "Hotel 0", "404 Great St", 175),
            new Hotel(2, "Hotel 1", "404 Great St", 300), new Hotel(3, "Hotel 2", "404 Great St", 222) };

    @GetMapping("/hotel/list")
    public String Hotels() {
        Gson gson = new Gson();
        String hotelsJson = gson.toJson(hotels);
        return hotelsJson;
    }
}