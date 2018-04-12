package congnv.test.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ProvinceBean {
	
	private int id;
	private String name;
	private String desc;
	
}
