package mobility;

import java.time.LocalDateTime;

public class Rental {
    private User user;
    private Bike bike;
    private LocalDateTime startTime;
    private LocalDateTime returnTime;
    
    public Rental(User user, Bike bike, LocalDateTime startTime) {
        if (user == null || bike == null || startTime == null) {
            throw new IllegalArgumentException("Les paramètres d'une location ne peuvent être nuls");
        }

        this.user = user;
        this.bike = bike;
        this.startTime = startTime;
        this.returnTime = null;
    }

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
        if(returnTime == null){
            throw new IllegalArgumentException("Le temps de retour ne peut pas être nul");
        }
        if(returnTime.isBefore(startTime)){
            throw new IllegalArgumentException("Le temps de retour ne peut pas être avant le temps de début");
        }
        this.returnTime = returnTime;
    }
}

