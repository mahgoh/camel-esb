package ch.fhnw.digient.routes;

import javax.xml.bind.JAXBContext;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.springframework.stereotype.Component;

import ch.fhnw.digient.model.CaseJSON;
import ch.fhnw.digient.model.CaseXML;
import ch.fhnw.digient.processor.CamelProcessor;

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

		from("file:C:/caseFolder") //the folder from which files are read
			.unmarshal(xmlDataFormat) //
			.process(new CamelProcessor())
			.marshal(jsonDataFormat)
			.to("jms:queue:digient"); //consumer is the queue receiving messages
	}

}
