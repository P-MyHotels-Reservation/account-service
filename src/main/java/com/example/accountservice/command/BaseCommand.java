package com.example.accountservice.command;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

public class BaseCommand<T> {

  @TargetAggregateIdentifier
  public final T id;

  public BaseCommand(T id) {
    this.id = id;
  }
}
