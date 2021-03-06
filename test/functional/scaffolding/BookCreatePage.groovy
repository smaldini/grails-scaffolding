package scaffolding

import geb.Page

class BookCreatePage extends Page {

	static url = "/book/create"
	static at = { title == "Create Book" }
	static content = {
		book { $("form") }
		createButton(to: BookShowPage) { $("input.save") }
		errors(required: false) { $(".errors li")*.text() }
	}

	boolean hasError(String fieldName) {
		book."$fieldName"().parent("li").hasClass("error")
	}

	boolean isRequired(String fieldName) {
		book."$fieldName"().parent("li").hasClass("required")
	}

}
