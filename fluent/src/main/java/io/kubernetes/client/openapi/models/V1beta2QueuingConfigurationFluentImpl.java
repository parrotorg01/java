package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1beta2QueuingConfigurationFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta2QueuingConfigurationFluent<A>{
  public V1beta2QueuingConfigurationFluentImpl() {
  }
  public V1beta2QueuingConfigurationFluentImpl(io.kubernetes.client.openapi.models.V1beta2QueuingConfiguration instance) {
    this.withHandSize(instance.getHandSize());

    this.withQueueLengthLimit(instance.getQueueLengthLimit());

    this.withQueues(instance.getQueues());

  }
  private java.lang.Integer handSize;
  private java.lang.Integer queueLengthLimit;
  private java.lang.Integer queues;
  public java.lang.Integer getHandSize() {
    return this.handSize;
  }
  public A withHandSize(java.lang.Integer handSize) {
    this.handSize=handSize; return (A) this;
  }
  public java.lang.Boolean hasHandSize() {
    return this.handSize != null;
  }
  public java.lang.Integer getQueueLengthLimit() {
    return this.queueLengthLimit;
  }
  public A withQueueLengthLimit(java.lang.Integer queueLengthLimit) {
    this.queueLengthLimit=queueLengthLimit; return (A) this;
  }
  public java.lang.Boolean hasQueueLengthLimit() {
    return this.queueLengthLimit != null;
  }
  public java.lang.Integer getQueues() {
    return this.queues;
  }
  public A withQueues(java.lang.Integer queues) {
    this.queues=queues; return (A) this;
  }
  public java.lang.Boolean hasQueues() {
    return this.queues != null;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2QueuingConfigurationFluentImpl that = (V1beta2QueuingConfigurationFluentImpl) o;
    if (handSize != null ? !handSize.equals(that.handSize) :that.handSize != null) return false;
    if (queueLengthLimit != null ? !queueLengthLimit.equals(that.queueLengthLimit) :that.queueLengthLimit != null) return false;
    if (queues != null ? !queues.equals(that.queues) :that.queues != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(handSize,  queueLengthLimit,  queues,  super.hashCode());
  }
  
}