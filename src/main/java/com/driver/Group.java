package com.driver;

import java.util.Objects;

public class Group {
    private String name;
    private int numberOfParticipants;

    public Group(String name, int numberOfParticipants) {
        this.name = name;
        this.numberOfParticipants = numberOfParticipants;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }
    @Override
    public boolean equals(object o){
        if(this== o) return true;
        if(!(o instanceof Group)) return false;
        Group group= (Group) o;
        return this.numberOfParticipants== group.numberOfParticipants && Objects.equals(this.name, group.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, numberOfParticipants);
    }
}
