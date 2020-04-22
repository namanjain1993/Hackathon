package com.amazon.hackathon.models.progress;

public class ProgressResponse {

    private String currentTask;

    private int percentage;



    public String getCurrentTask() {

        return currentTask;
    }

    public void setCurrentTask(final String currentTask) {

        this.currentTask = currentTask;
    }

    public int getPercentage() {

        return percentage;
    }

    public void setPercentage(final int percentage) {

        this.percentage = percentage;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("ProgressResponse{");
        sb.append("currentTask='").append(currentTask).append('\'');
        sb.append(", percentage=").append(percentage);
        sb.append('}');
        return sb.toString();
    }

    public static final class ProgressResponseBuilder {

        private String currentTask;
        private int percentage;

        private ProgressResponseBuilder() {

        }

        public static ProgressResponseBuilder aProgressResponse() {

            return new ProgressResponseBuilder();
        }

        public ProgressResponseBuilder withCurrentTask(String currentTask) {

            this.currentTask = currentTask;
            return this;
        }

        public ProgressResponseBuilder withPercentage(int percentage) {

            this.percentage = percentage;
            return this;
        }

        public ProgressResponse build() {

            ProgressResponse progressResponse = new ProgressResponse();
            progressResponse.setCurrentTask(currentTask);
            progressResponse.setPercentage(percentage);
            return progressResponse;
        }
    }
}
