// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface LocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional double degreesLatitude = 1;</code>
   * @return Whether the degreesLatitude field is set.
   */
  boolean hasDegreesLatitude();
  /**
   * <code>optional double degreesLatitude = 1;</code>
   * @return The degreesLatitude.
   */
  double getDegreesLatitude();

  /**
   * <code>optional double degreesLongitude = 2;</code>
   * @return Whether the degreesLongitude field is set.
   */
  boolean hasDegreesLongitude();
  /**
   * <code>optional double degreesLongitude = 2;</code>
   * @return The degreesLongitude.
   */
  double getDegreesLongitude();

  /**
   * <code>optional string name = 3;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
