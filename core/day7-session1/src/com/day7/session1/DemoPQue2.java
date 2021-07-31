package com.day7.session1;

import java.util.Comparator;
import java.util.PriorityQueue;

class Job implements Comparable<Job>{
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
public class DemoPQue2 {
	
	public static void main(String[] args) {
		PriorityQueue<Job> que=new PriorityQueue<>(new Comparator<Job>() {

			@Override
			public int compare(Job o1, Job o2) {
				return Integer.compare(o2.getPriority(), o1.getPriority());
			}
		});
		que.offer(new Job(12, "anil", 6));
		que.offer(new Job(102, "foo", 1));
		
		Job job=que.poll();
		System.out.println(job);
		
	}

}
