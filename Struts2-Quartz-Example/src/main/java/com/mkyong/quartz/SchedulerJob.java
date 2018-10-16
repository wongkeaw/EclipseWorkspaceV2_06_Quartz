package com.mkyong.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SchedulerJob implements Job {
	public void execute(JobExecutionContext context)
			throws JobExecutionException {

		System.out.println("Struts 2.3.4 + Quartz 2.1.5");

	}
}