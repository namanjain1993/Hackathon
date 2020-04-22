package com.amazon.hackathon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.hackathon.models.progress.ProgressResponse;

@RestController
@RequestMapping("/progress")
public class ProgressController {

    public static String currentTask;

    public static int percentage;

    @GetMapping(value = "/getProgress")
    public static ProgressResponse getProgressResponse() {

        return ProgressResponse.ProgressResponseBuilder.
            aProgressResponse().withCurrentTask(currentTask).withPercentage(percentage).build();
    }

    public static void setCurrentTask(final String currentTask) {

        ProgressController.currentTask = currentTask;
    }

    public static void setPercentage(final int percentage) {

        ProgressController.percentage = percentage;
    }
}
