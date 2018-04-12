package congnv.test;

import com.mario.entity.impl.BaseMessageHandler;
import com.mario.entity.message.Message;
import com.nhb.common.data.PuElement;
import com.nhb.common.data.PuObject;
import com.nhb.common.data.PuValue;

public class TestHttpHandler extends BaseMessageHandler {
	
	public void init() {
		getLogger().info("Init {} instance with name {}", this.getClass().getName(), this.getName());
	}
	
	@Override
	public PuElement handle(Message message) {
		getLogger().debug("abc");
		if (message.getData() instanceof PuObject) {
			PuObject params = (PuObject) message.getData();
			String command = params.getString("command", null);
			if (command != null) {
				switch (command.toLowerCase()) {
				case "hello":
					return PuValue.fromObject("World!");
				}
			}
		}
		return PuValue.fromObject("no command");		
	}
}
