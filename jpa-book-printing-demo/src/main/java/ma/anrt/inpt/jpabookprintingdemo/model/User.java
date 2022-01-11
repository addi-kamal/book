package ma.anrt.inpt.jpabookprintingdemo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name="users")
@RequiredArgsConstructor
@NoArgsConstructor
@ToString

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	@NonNull
	private String username;
	@NonNull
	private String password;
	@Enumerated(EnumType.STRING)
	@NonNull
	private Role role;
	//Mapping to address
	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;
}
