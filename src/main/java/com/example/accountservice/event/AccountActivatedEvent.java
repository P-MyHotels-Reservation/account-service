package com.example.accountservice.event;

import com.example.accountservice.constant.Status;

public class AccountActivatedEvent extends BaseEvent<String> {

  public final Status status;

  public AccountActivatedEvent(String id, Status status) {
    super(id);
    this.status = status;
  }
}
