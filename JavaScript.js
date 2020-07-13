/**
 * Checked Out JQuery (Copyright OpenJS Foundation and other contributors, https://openjsf.org/)
 * Uncopied Source-Code
 */
//(function(e) {
String.prototype.times = (times) => {return Array(times + 1).join(this)},
String.prototype.range = (startIndex, endIndex) => {endIndex = endIndex || startIndex; return this.slice(startIndex, endIndex)}

var e = e ? e : window.event;
transTable = class transTable {
	constructor() {
		this.table = {}
	}
	
	setLang(lang, value) {
		if ("object" === typeof value) {
			return this.table[lang] = value
		}
	}
	set(value) {
		if ("object" === typeof value) {
			return this.table = value
		}
	}
	getLang(lang) {
		return this.table[lang]
	}
	get() {
		return this.table
	}
	
	trans() {
		let elements = document.getElementsByTagName("trans");
		let element = undefined
		for(var i = 0; i < elements.length; i++) {
			element = elements[i];
			element.innerHTML = (this.table[element.dataset.lang])[element.dataset.mark];
		}
	}
}
el = function (selector, index) {
	let element = document.querySelector(selector);
	if(index) {element = element[index]}
	return {
		id: () => {return element.id},
		cls: () => {return element.classList},
		tag: () => {return element.tagName},
		attr: function(attributeName, fixTo) {
			let fixto = fixTo || 0;
			return eval([`element.getAttribute(${attributeName})`, `element.setAttribute(${attributeName}, ${fixto})`][Boolean(fixto)])
		},
		dataset: function(datasetName, fixTo) {
			if (fixTo) let extra = ` = ${fixTo}`
			return eval(`element.dataset[${datasetName}]` + extra);
		},
		htm: function(fixTo) {
			if(fixTo) let extra = ` = ${fixTo}`
			return eval(`element.innerHTML` + extra);
		},
		txt: function() {return element.innerText}
	}
}
//})();
