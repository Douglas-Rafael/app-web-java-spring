package br.com.douglasrafael.screenmatch.domain.movie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Movie")
@Table(name = "movies")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer durationInMinutes;
	private Integer releaseYear;
	private String genre;

	public Movie(MovieRegisterData data) {
		this.name = data.name();
		this.durationInMinutes = data.duration();
		this.releaseYear = data.age();
		this.genre = data.genre();
	}

	public void updateData(MovieAlterData data) {
		this.name = data.name();
		this.durationInMinutes = data.duration();
		this.releaseYear = data.age();
		this.genre = data.genre();

	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", durationInMinutes=" + durationInMinutes + ", releaseYear=" + releaseYear
				+ ", genre=" + genre + "]";
	}

}
