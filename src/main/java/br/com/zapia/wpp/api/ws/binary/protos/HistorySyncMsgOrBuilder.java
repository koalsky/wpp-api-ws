// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface HistorySyncMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.HistorySyncMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .binary.WebMessageInfo message = 1;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <code>optional .binary.WebMessageInfo message = 1;</code>
   * @return The message.
   */
  br.com.zapia.wpp.api.ws.binary.protos.WebMessageInfo getMessage();
  /**
   * <code>optional .binary.WebMessageInfo message = 1;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.WebMessageInfoOrBuilder getMessageOrBuilder();

  /**
   * <code>optional uint64 msgOrderId = 2;</code>
   * @return Whether the msgOrderId field is set.
   */
  boolean hasMsgOrderId();
  /**
   * <code>optional uint64 msgOrderId = 2;</code>
   * @return The msgOrderId.
   */
  long getMsgOrderId();
}
