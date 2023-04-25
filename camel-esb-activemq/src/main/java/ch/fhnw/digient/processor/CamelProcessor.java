package ch.fhnw.digient.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import ch.fhnw.digient.model.CaseJSON;
import ch.fhnw.digient.model.CaseXML;

/**
 * @author charuta.pande
 *         This class implements the interface Processor
 *         to perform message translation
 *         from XML to JSON format
 *
 */
public class CamelProcessor implements Processor {

	/*
	 * Exchange is the container that holds the information during message routing
	 * a. An Exchange is created when a Consumer receives a request
	 * b. A new Message is created, the request is set as the body of the Message
	 * and
	 * depending on the Consumer other Endpoint and protocol related information
	 * is added as headers on the Message.
	 * c. Then an Exchange is created and the newly created Message is set as the
	 * "in" on the Exchange
	 */
	public void process(Exchange exchange) throws Exception {
		// The data read from the file is read into CaseXML and set as "in" on the
		// exchange
		CaseXML xmlCase = exchange.getIn().getBody(CaseXML.class);

		CaseJSON jsonCase = new CaseJSON();
		System.out.println(xmlCase.getDescription());

		jsonCase.setIncidentId(xmlCase.getId());
		jsonCase.setShortDescription(xmlCase.getDescription());
		jsonCase.setReportDateTime(xmlCase.getCallDate());
		jsonCase.setClientId(xmlCase.getClientId());

		exchange.getIn().setBody(jsonCase);
	}

}
