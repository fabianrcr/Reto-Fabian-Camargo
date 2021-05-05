# Autor: Fabian Camargo
@stories
Feature: Academy Choucair
  As a User, I want to learn how to automatic in screamplay at the Choucair Academy with the automain course
  @scenario1
  Scenario: search fot a automation course
    Given than brandon wants to learn automation at the acedemy Choucair
    | strUser | strPassword |
    | 1058325293 | Choucair2021* |
    When he search for the course Foundation Express on the choucair academy platform
    | strCourse |
    | Foundation Express |
    Then he finds the course called
    | strCourse |
    | Foundation Express |