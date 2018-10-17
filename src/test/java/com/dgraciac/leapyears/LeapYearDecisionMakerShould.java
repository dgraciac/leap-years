package com.dgraciac.leapyears;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearDecisionMakerShould {
    @Test
    public void say_no_if_year_is_not_divisible_by_4() {
        LeapYearDecisionMaker leapYearDecisionMaker = new LeapYearDecisionMaker();

        assertThat(leapYearDecisionMaker.isLeapYear(3)).isFalse();
        assertThat(leapYearDecisionMaker.isLeapYear(5)).isFalse();
        assertThat(leapYearDecisionMaker.isLeapYear(2)).isFalse();
        assertThat(leapYearDecisionMaker.isLeapYear(1997)).isFalse();
    }

    @Test
    public void say_yes_if_year_is_divisible_by_4() {
        LeapYearDecisionMaker leapYearDecisionMaker = new LeapYearDecisionMaker();

        assertThat(leapYearDecisionMaker.isLeapYear(0)).isTrue();
        assertThat(leapYearDecisionMaker.isLeapYear(4)).isTrue();
        assertThat(leapYearDecisionMaker.isLeapYear(8)).isTrue();
        assertThat(leapYearDecisionMaker.isLeapYear(1996)).isTrue();
    }

    @Test
    public void say_no_if_year_is_divisible_by_100_but_not_by_400() {
        LeapYearDecisionMaker leapYearDecisionMaker = new LeapYearDecisionMaker();

        assertThat(leapYearDecisionMaker.isLeapYear(100)).isFalse();
        assertThat(leapYearDecisionMaker.isLeapYear(200)).isFalse();
        assertThat(leapYearDecisionMaker.isLeapYear(300)).isFalse();
        assertThat(leapYearDecisionMaker.isLeapYear(500)).isFalse();
        assertThat(leapYearDecisionMaker.isLeapYear(1800)).isFalse();
    }

    @Test
    public void say_yes_if_year_is_divisible_by_400() {
        LeapYearDecisionMaker leapYearDecisionMaker = new LeapYearDecisionMaker();

        assertThat(leapYearDecisionMaker.isLeapYear(0)).isTrue();
        assertThat(leapYearDecisionMaker.isLeapYear(400)).isTrue();
        assertThat(leapYearDecisionMaker.isLeapYear(800)).isTrue();
        assertThat(leapYearDecisionMaker.isLeapYear(1200)).isTrue();
        assertThat(leapYearDecisionMaker.isLeapYear(1600)).isTrue();
    }
}
