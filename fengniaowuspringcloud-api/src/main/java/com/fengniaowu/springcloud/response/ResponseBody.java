package com.fengniaowu.springcloud.response;

public class ResponseBody {

	   // 状态码
		private Integer state;
		
		// 提示信息
		private String message;
	 
		// 返回数据
		private Object data;
	 
		public Integer getState() {
			return state;
		}
	 
		public void setState(Integer state) {
			this.state = state;
		}
	 
		public String getMessage() {
			return message;
		}
	 
		public void setMessage(String message) {
			this.message = message;
		}
	 
		public Object getData() {
			return data;
		}
	 
		public void setData(Object data) {
			this.data = data;
		}
	 
		public ResponseBody(Integer state, String message) {
			super();
			this.state = state;
			this.message = message;
		}
	 
		public ResponseBody() {
			this.state = 1;
			this.message = "successed";
		}
	 
		public ResponseBody(Object data) {
			super();
			this.state = 1;
			this.message = "successed";
			this.data = data;
		}
	 
	/*	public ResponseBody(ExceptionResultEnum ) {
			super();
			this.message = exResEnum.getMessage();
			this.state = exResEnum.getstate();
		}*/
}
