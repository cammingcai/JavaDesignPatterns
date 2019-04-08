package builder;
/**建造者模式*/
public class CammingBuilder {

	private int age;
	private String height;
	private boolean sex;
	private String address;
	private String phone;
	
	public CammingBuilder(Builder builder) {
		this.age = builder.age;
		this.height = builder.height;
		this.sex = builder.sex;
		this.address = builder.address;
		this.phone = builder.phone;
		
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CammingBuilder [age=" + age + ", height=" + height + ", sex=" + sex + ", address=" + address
				+ ", phone=" + phone + "]";
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}



	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}



	/**
	 * @return the sex
	 */
	public boolean isSex() {
		return sex;
	}



	/**
	 * @param sex the sex to set
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}



	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}



	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}



	public static class Builder {
		private int age;
		private String height;
		private boolean sex;
		private String address;
		private String phone;
	
		/**
		 * @param age the age to set
		 */
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
		/**
		 * @param height the height to set
		 */
		public Builder setHeight(String height) {
			this.height = height;
			return this;
		}
	
		/**
		 * @param sex the sex to set
		 */
		public Builder setSex(boolean sex) {
			this.sex = sex;
			return this;
		}
	
		/**
		 * @param address the address to set
		 */
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		/**
		 * @param phone the phone to set
		 */
		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		
		public CammingBuilder build() {
			return new CammingBuilder(this);
		}
		
	}
}
