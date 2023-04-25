package ch.fhnw.digient.routes;

import javax.xml.bind.JAXBContext;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.springframework.stereotype.Component;

import ch.fhnw.digient.model.CaseJSON;
import ch.fhnw.digient.model.CaseXML;
import ch.fhnw.digient.processor.CamelProcessor;

/**
 * @author charuta.pande
 * This class is used to define the routing rules
 * A route contains the integration logic and is implemented using EIP
 *
 */

@Component
public class CamelRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// XML Data Format
		JaxbDataFormat xmlDataFormat = new JaxbDataFormat();		
		JAXBContext con = JAXBContext.newInstance(CaseXML.class);
		xmlDataFormat.setContext(con);
		 
		// JSON Data Format
		JacksonDataFormat jsonDataFormat = new JacksonDataFormat(CaseJSON.class);

		from("file:/Users/marco/Downloads/de") //the folder from which files are read
			.unmarshal(xmlDataFormat) //convert the representation of the object used in communication to the internal representation
			.process(new CamelProcessor()) //transform the data from XML to JSON
			.marshal(jsonDataFormat) //convert the internal representation of the object to the representation needed for communication
			.to("jms:queue:digient"); //send data to the queue as a message
	}

}
