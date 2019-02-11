package net.manager.mvc.request;

import org.springframework.lang.NonNull;

public class IdRequest {

	private Long _id;

	@NonNull
	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		_id = id;
	}
}
