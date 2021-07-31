package com.day7.session2;

public class Job implements Comparable<Job>{
	private int jobId;
	private String workerName;
	private int priority;
	
	public Job(int jobId, String workerName, int priority) {
		this.jobId = jobId;
		this.workerName = workerName;
		this.priority = priority;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(Job o) {
		return Integer.compare(this.getJobId(), o.getJobId());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Job [jobId=");
		builder.append(jobId);
		builder.append(", workerName=");
		builder.append(workerName);
		builder.append(", priority=");
		builder.append(priority);
		builder.append("]");
		return builder.toString();
	}

	
}