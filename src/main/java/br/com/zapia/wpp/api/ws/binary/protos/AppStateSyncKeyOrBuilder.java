// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface AppStateSyncKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.AppStateSyncKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
   * @return Whether the keyId field is set.
   */
  boolean hasKeyId();
  /**
   * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
   * @return The keyId.
   */
  br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyId getKeyId();
  /**
   * <code>optional .binary.AppStateSyncKeyId keyId = 1;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyIdOrBuilder getKeyIdOrBuilder();

  /**
   * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
   * @return Whether the keyData field is set.
   */
  boolean hasKeyData();
  /**
   * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
   * @return The keyData.
   */
  br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyData getKeyData();
  /**
   * <code>optional .binary.AppStateSyncKeyData keyData = 2;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.AppStateSyncKeyDataOrBuilder getKeyDataOrBuilder();
}
