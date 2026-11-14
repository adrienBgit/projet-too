package mobility;

import java.time.LocalDateTime;

public class MobilityService{

    public Rental rentBike(User user, Bike bike, Station station, LocalDateTime startTime){
        if(user == null || bike == null || station == null || startTime == null){
            throw new IllegalArgumentException("Tous les paramètres doivent être fournis");
        }
        if(!bike.isAvailable()){
            throw new IllegalStateException("Bike is not available");
        }
        if(!station.containtsBike(bike)){
            throw new IllegalArgumentException("Bike does not belong to this station");
        }
        station.removeBike(bike);
        bike.setAvailable(false);

        return new Rental(user, bike, startTime);
    }

    public void returnBike(Rental rental, Station station, LocalDateTime returnTime){
        if(rental == null || station == null || returnTime == null){
            throw new IllegalArgumentException("Parametres invalides");
        }
        
        if(!rental.isActive()){
            throw new IllegalStateException("Location pas active");
        }
        if(returnTime.isBefore(rental.getStartTime())){
            throw new IllegalArgumentException("L'heure de retour ne peut pas être antérieure à l'heure de début");
        }

        rental.finish(returnTime);
        station.addBike(rental.getBike());
        rental.getBike().setAvailable(true);
    }

}