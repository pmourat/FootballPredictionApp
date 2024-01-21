package com.football.prediction.TiresiasProphetPredictions.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Class that represents the response from the RapidApi fixture call
 */
@Data
public class Fixture {

    @JsonProperty("errors")
    private String[] errors;

    @JsonProperty("response")
    private Response[] response;

    @JsonProperty("results")
    private int results;

    @Data
    public static class Response {
        @JsonProperty("fixture")
        private FixtureInfo fixture;

        @JsonProperty("league")
        private LeagueInfo league;

        @JsonProperty("teams")
        private TeamsInfo teams;

        @JsonProperty("goals")
        private GoalsInfo goals;

        @JsonProperty("score")
        private ScoreInfo score;

        @Data
        public static class FixtureInfo {
            private String id;
            private String referee;
            private String timezone;
            private String date;
            private long timestamp;
            private Periods periods;
            private Venue venue;
            private Status status;
        }

        @Data
        public static class Periods {
            private String first;
            private String second;
        }

        @Data
        public static class Venue {
            private long id;
            private String name;
            private String city;
        }

        @Data
        public static class Status {
            private String longStatus;
            private String shortStatus;
            private Integer elapsed;
        }

        @Data
        public static class LeagueInfo {
            private int id;
            private String name;
            private String country;
            private String logo;
            private String flag;
            private int season;
            private String round;
        }

        @Data
        public static class TeamsInfo {
            private TeamInfo home;
            private TeamInfo away;

            @Data
            public static class TeamInfo {
                private int id;
                private String name;
                private String logo;
                private String winner;
            }
        }

        @Data
        public static class GoalsInfo {
            private Integer home;
            private Integer away;
        }

        @Data
        public static class ScoreInfo {
            private HalftimeInfo halftime;
            private FulltimeInfo fulltime;
            private ExtratimeInfo extratime;
            private PenaltyInfo penalty;

            @Data
            public static class HalftimeInfo {
                private Integer home;
                private Integer away;
            }

            @Data
            public static class FulltimeInfo {
                private Integer home;
                private Integer away;
            }

            @Data
            public static class ExtratimeInfo {
                private Integer home;
                private Integer away;
            }

            @Data
            public static class PenaltyInfo {
                private Integer home;
                private Integer away;
            }
        }
    }

    public String getFixtureId() {
        if (response != null && response.length > 0) {
            return response[0].getFixture().getId();
        }
        return null;
    }
}
