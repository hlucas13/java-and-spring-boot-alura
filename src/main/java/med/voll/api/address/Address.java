package med.voll.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private String neighborhood;
    private String postcode;
    private String city;
    private String state;
    private String number;
    private String complement;

    public Address(AddressData data) {
        this.street = data.street();
        this.neighborhood = data.neighborhood();
        this.postcode = data.postcode();
        this.city = data.city();
        this.state = data.state();
        this.number = data.number();
        this.complement = data.complement();
    }

    public void updateInfo(AddressData data) {
        if (data.street() != null) {
            this.street = data.street();
        }

        if (data.neighborhood() != null) {
            this.neighborhood = data.neighborhood();
        }

        if (data.postcode() != null) {
            this.postcode = data.postcode();
        }

        if (data.city() != null) {
            this.city = data.city();
        }

        if (data.state() != null) {
            this.state = data.state();
        }

        if (data.number() != null) {
            this.number = data.number();
        }

        if (data.complement() != null) {
            this.complement = data.complement();
        }
    }
}
