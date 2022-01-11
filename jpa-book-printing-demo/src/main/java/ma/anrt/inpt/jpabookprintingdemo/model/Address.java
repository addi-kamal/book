package ma.anrt.inpt.jpabookprintingdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name="addresses")
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String app;
	@NonNull
	private String im;
	@NonNull
	private String blv;
	@NonNull
	private String ville;
	//link to a user
	@OneToOne(mappedBy = "address")
	private User user;
}