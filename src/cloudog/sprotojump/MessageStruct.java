package cloudog.sprotojump;

import java.util.ArrayList;
import java.util.List;

public class MessageStruct {
	int memberCount;
	String messageName;
	List<String> nameList=new ArrayList<String>();
	List<MessageType> typeList=new ArrayList<MessageType>();
	List<Object> objectList=new ArrayList<Object>();
}
