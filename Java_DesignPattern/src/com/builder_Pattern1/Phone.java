package com.builder_Pattern1;

public class Phone {

	private String Os;
	private String cpu;
	private int memory;
	private String scrensize;
	
	
	
	public Phone() {
		super();
	}
	public Phone(String os, String cpu, int memory, String scrensize) {
		super();
		Os = os;
		this.cpu = cpu;
		this.memory = memory;
		this.scrensize = scrensize;
	}
	public Phone setOs(String os) {
		Os = os;
		return this;
	}
	public Phone setCpu(String cpu) {
		this.cpu = cpu;
		return this;
	}
	public Phone setMemory(int memory) {
		this.memory = memory;
		return this;
	}
	public Phone setScrensize(String scrensize) {
		this.scrensize = scrensize;
		return this;
	}
	
	
	
	@Override
	public String toString() {
		return "Phone [Os=" + Os + ", cpu=" + cpu + ", memory=" + memory + ", scrensize=" + scrensize + "]";
	}
	public Phone getPhone() {
		return new Phone(Os, cpu, memory, scrensize);
	}
	
	
}



