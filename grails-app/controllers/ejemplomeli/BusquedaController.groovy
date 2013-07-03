package ejemplomeli

import grails.converters.JSON

class BusquedaController {
	static allowedMethods = [save: "POST", update: "POST", delete: "POST"]
	
    def index() { }
	
	def result() {
		def puntosFechaUsuarioInstance = params
		//def http = new HTTPBuilder('http://api.mercadolibre.com/sites/MLB/search?q=ipod')
		render(template:'puntosUsuarios', model:[puntosFechaUsuarioInstanceList:puntos]) as JSON
	}
	
}
