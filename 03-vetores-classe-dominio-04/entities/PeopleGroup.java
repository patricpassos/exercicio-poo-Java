package entities;

public class PeopleGroup {

	private final Personv[] people;

	public PeopleGroup(Personv[] people) {
		this.people = validatePeople(people);
	}

	public Personv findOldest() {
		Personv oldest = people[0];
		for (int i = 1; i < people.length; i++) {
			if (people[i].getAge() > oldest.getAge()) {
				oldest = people[i];
			}
		}
		return oldest;
	}

	// fail-fast
	private static Personv[] validatePeople(Personv[] people) {
		if (people == null || people.length == 0) {
			throw new IllegalArgumentException("Person array cannot be empty.");
		}
		for (Personv p : people) {
			if (p == null) {
				throw new IllegalArgumentException("Person cannot be null.");
			}
		}
		return people;
	}
}
