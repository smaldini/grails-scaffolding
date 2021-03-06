package scaffolding.example

class Book {

	String title
	List<Author> authors
	String yearOfPublication
	// numeric field
	// boolean field
	// enum field
	// date field
	Date dateCreated
	Date lastUpdated

	static hasMany = [authors: Author]

    static constraints = {
		title blank: false
		authors minSize: 1
		yearOfPublication blank: false, matches: /\d{4}/
    }

	String toString() {
		title
	}
}
