 /**
 * 
 */
package com.my.own.examples.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.my.own.examples.dto.Instruction;
import com.my.own.examples.dto.Message;

/**
 * @author Krish S
 *
 */
@RestController
@RequestMapping("/sample")
public class ServiceController {

	@RequestMapping(value="/list",method=RequestMethod.GET,produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins="*")
	public List<Message> getList(){

		return getMessages();
		
	}
	private List<Message> getMessages(){
		Message message = new Message();
		List<Instruction> instructions =  new ArrayList<Instruction>();
		Instruction instruction = new Instruction();
		instruction.setInstructionId(50);
		instruction.setDeal("AZ001");
		instruction.setDestinationAccount("599");
		instruction.setRequestedPar(50000);
		instruction.setSettledPar(25000);
		instruction.setRegion("R1");
		instruction.setStatus("Pending");
		//instruction.setUpdateTime(new Date());
		
		instructions.add(instruction);
		message.setInstructions(instructions);
		message.setAccountNumber("599");
		message.setCurrentStatus("Partial");
		message.setDestinationSystemId("R2");
		message.setRequestedStatus("Pending");
		message.setId(55);
		message.setSystem("R1");
		
		//Message message1 = new Message();
		//List<Instruction> instructions1 =  new ArrayList<Instruction>();
		Instruction instruction1 = new Instruction();
		instruction1.setInstructionId(51);
		instruction1.setDeal("AZ001");
		instruction1.setDestinationAccount("599");
		instruction1.setRequestedPar(50000);
		instruction1.setSettledPar(25000);
		instruction1.setRegion("R1");
		instruction1.setStatus("Pending");
		//instruction1.setUpdateTime(new Date());
		
		instructions.add(instruction1);
		message.setInstructions(instructions);
		message.setAccountNumber("BZP");
		message.setCurrentStatus("Partial");
		message.setDestinationSystemId("R2");
		message.setRequestedStatus("Pending");
		message.setId(56);
		message.setSystem("R1");
		//Message message2 = new Message();
		//List<Instruction> instructions2 =  new ArrayList<Instruction>();
		Instruction instruction2 = new Instruction();
		
		instruction2.setInstructionId(52);
		instruction2.setDeal("AZ001");
		instruction2.setDestinationAccount("599");
		instruction2.setRequestedPar(50000);
		instruction2.setSettledPar(25000);
		instruction2.setRegion("R1");
		instruction2.setStatus("Pending");
		//instruction2.setUpdateTime(new Date());
		
		
		instructions.add(instruction2);
		message.setInstructions(instructions);
		message.setAccountNumber("599");
		message.setCurrentStatus("Partial");
		message.setDestinationSystemId("R2");
		message.setRequestedStatus("Pending");
		message.setId(58);
		message.setSystem("R1");
		
		//Message message3 = new Message();
		//List<Instruction> instructions3 =  new ArrayList<Instruction>();
		Instruction instruction3 = new Instruction();
		
		instruction3.setInstructionId(53);
		instruction3.setDeal("AZ001");
		instruction3.setDestinationAccount("599");
		instruction3.setRequestedPar(50000);
		instruction3.setSettledPar(25000);
		instruction3.setRegion("R1");
		instruction3.setStatus("Pending");
		//instruction3.setUpdateTime(new Date());
		
		
		instructions.add(instruction3);
		message.setInstructions(instructions);
		message.setAccountNumber("MGN");
		message.setCurrentStatus("Partial");
		message.setDestinationSystemId("R2");
		message.setRequestedStatus("Pending");
		message.setId(59);
		message.setSystem("R1");
		//Message message4 = new Message();
		//List<Instruction> instructions4 =  new ArrayList<Instruction>();
		Instruction instruction4 = new Instruction();

		instruction4.setInstructionId(54);
		instruction4.setDeal("AZ001");
		instruction4.setDestinationAccount("599");
		instruction4.setRequestedPar(50000);
		instruction4.setSettledPar(25000);
		instruction4.setRegion("R1");
		instruction4.setStatus("Pending");
		//instruction4.setUpdateTime(new Date());
		
		instructions.add(instruction4);
		message.setInstructions(instructions);
		message.setAccountNumber("MGN");
		message.setCurrentStatus("Partial");
		message.setDestinationSystemId("R2");
		message.setRequestedStatus("Pending");
		message.setId(60);
		message.setSystem("R1");
		List<Message> messages = new ArrayList<Message>();
		
		messages.add(message);
//		messages.add(message1);
//		messages.add(message2);
//		messages.add(message3);
	//	messages.add(message4);
		
		return messages;
	}
	
	@RequestMapping(path="/updateinstruction",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	@CrossOrigin(origins="*")
	public void postInstructions(List<Instruction> instructions){
		for (Instruction instruction : instructions) {
			System.out.println(instruction.getInstructionId());
		}
		System.out.println("End of this request");
		
	}
	
}
