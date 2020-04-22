import controller.OfferController;
import models.offer.OfferCreationRequest;

public class Main {

    public static void main(String[] args) {

        OfferCreationRequest offerCreationRequest = new OfferCreationRequest("Mid", true, 10);

        System.out.println(OfferController.createOffer(offerCreationRequest));
    }

}
