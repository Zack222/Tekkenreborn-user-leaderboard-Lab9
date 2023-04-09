package com.cpan228.tekkenuserdashboard.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpan228.tekkenuserdashboard.model.TekkenUser;

@RestController
@RequestMapping("/api/userdashboard")
public class UserDashboardController {

    @GetMapping
    public List<TekkenUser> getUsers() {
        var usersStream = Stream.of(new TekkenUser("Zack", 11, 9, 7), new TekkenUser("jake", 15, 5, 5),
                new TekkenUser("naruto", 15, 6, 4));
        return usersStream.sorted(Comparator.comparing(TekkenUser::getWins)).collect(Collectors.toList());

    }

}
