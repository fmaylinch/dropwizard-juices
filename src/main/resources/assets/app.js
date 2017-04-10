
console.log("Loaded!");

// Arguments for the AJAX call
let settings = {
	method: "GET",
	url: "http://localhost:8080/api/juices"
};

console.log("Retrieving juices...");

// Make the AJAX call
let promise = $.ajax(settings);

// In case of success we display the juices
promise.done(juices => {

	console.log("OK!");

	let list = document.querySelector("#list");

	for (let juice of juices) {
		console.log(juice);

		let linea = "<div class='juice'>" + juice.name + " vale " + juice.price + "€" + "</div>";

		list.innerHTML += linea;
	}

});

// In case of failure
promise.fail((jqXHR, textStatus, errorThrown) => {
	console.error("Error in request", textStatus, errorThrown);
});