package com.pl.premier_league.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")
public class Player {
    @Id
    @Column(name = "player_name", unique = true, nullable = false)
    private String name;

    @Column(name = "nation")
    private String nation;

    @Column(name = "position")
    private String pos;

    @Column(name = "age")
    private Integer age;

    @Column(name = "matches_played")
    private Integer mp;

    @Column(name = "starts")
    private Integer starts;

    @Column(name = "minutes_played")
    private Double min;  // Reverted to Double

    @Column(name = "goals")
    private Double gls;  // Reverted to Double

    @Column(name = "assists")
    private Double ast;  // Reverted to Double

    @Column(name = "penalties_scored")
    private Double pk;  // Reverted to Double

    @Column(name = "yellow_cards")
    private Double crdy;  // Reverted to Double

    @Column(name = "red_cards")
    private Double crdr;  // Reverted to Double

    @Column(name = "expected_goals")
    private Double xg;

    @Column(name = "expected_assists")
    private Double xag;

    @Column(name = "team_name")
    private String team;

    public Player() {
    }

    public Player(String nation, String name, String pos, Integer age, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pk, Double crdy, Double crdr, Double xg, Double xag, String team) {
        this.nation = nation;
        this.name = name;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pk = pk;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getGls() {
        return gls;
    }

    public void setGls(double gls) {
        this.gls = gls;
    }

    public double getAst() {
        return ast;
    }

    public void setAst(double ast) {
        this.ast = ast;
    }

    public double getPk() {
        return pk;
    }

    public void setPk(double pk) {
        this.pk = pk;
    }

    public double getCrdy() {
        return crdy;
    }

    public void setCrdy(double crdy) {
        this.crdy = crdy;
    }

    public double getCrdr() {
        return crdr;
    }

    public void setCrdr(double crdr) {
        this.crdr = crdr;
    }

    public double getXg() {
        return xg;
    }

    public void setXg(double xg) {
        this.xg = xg;
    }

    public double getXag() {
        return xag;
    }

    public void setXag(double xag) {
        this.xag = xag;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", pos='" + pos + '\'' +
                ", age=" + age +
                ", mp=" + mp +
                ", starts=" + starts +
                ", min=" + min +
                ", gls=" + gls +
                ", ast=" + ast +
                ", pk=" + pk +
                ", crdy=" + crdy +
                ", crdr=" + crdr +
                ", xg=" + xg +
                ", xag=" + xag +
                ", team='" + team + '\'' +
                '}';
    }
}

