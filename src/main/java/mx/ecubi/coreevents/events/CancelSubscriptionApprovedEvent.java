package mx.ecubi.coreevents.events;

import mx.ecubi.coreevents.entities.Company;
import mx.ecubi.coreevents.entities.Subscription;

public class CancelSubscriptionApprovedEvent {
	private String eventId;

	private String subscriptionVendorId;

	private Company company;

	private Subscription canceledSubscription;

	private String companyId;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Subscription getCanceledSubscription() {
		return canceledSubscription;
	}

	public void setCanceledSubscription(Subscription canceledSubscription) {
		this.canceledSubscription = canceledSubscription;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getSubscriptionVendorId() {
		return subscriptionVendorId;
	}

	public void setSubscriptionVendorId(String subscriptionVendorId) {
		this.subscriptionVendorId = subscriptionVendorId;
	}

}
