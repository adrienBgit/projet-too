package mobility;

import java.time.LocalDateTime;

public class Rental {
    public User getUser(){
        return this.user;
    }
    public Bike getBike(){
        return this.bike;
    }
    public LocalDateTime getStartTime(){
        return this.startTime;
    }
    public LocalDateTime getReturnTime(){
        return this.returnTime;
    }

    public boolean isActive(){
        return returnTime == null;
    }
    public void finish(LocalDateTime returnTime){
        returnTime.isBefore(startTime);
    }
}

public Rental rentBike(
    User user,
    Bike bike,
    Station station,
    LocalDateTime startTime
){
    if()
}

