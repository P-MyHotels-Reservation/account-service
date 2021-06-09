package com.example.accountservice.event;

import com.example.accountservice.constant.Status;

public class AccountHeldEvent extends BaseEvent<String> {

  public final Status status;

  public AccountHeldEvent(String id, Status status) {
    super(id);
    this.status = status;
  }
}
