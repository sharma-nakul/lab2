// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: polling.proto

package io.grpc.examples.polling;

public final class PollingProto {
  private PollingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_example_polling_PollRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_example_polling_PollRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_example_polling_PollResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_example_polling_PollResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rpolling.proto\022\024grpc.example.polling\"-\n" +
      "\013PollRequest\022\014\n\004name\030\001 \001(\t\022\020\n\010question\030\002" +
      " \001(\t\".\n\014PollResponse\022\014\n\004name\030\001 \001(\t\022\020\n\010qu" +
      "estion\030\002 \001(\t2]\n\007Polling\022R\n\007getPoll\022!.grp" +
      "c.example.polling.PollRequest\032\".grpc.exa" +
      "mple.polling.PollResponse\"\000B*\n\030io.grpc.e" +
      "xamples.pollingB\014PollingProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_grpc_example_polling_PollRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_example_polling_PollRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_example_polling_PollRequest_descriptor,
        new java.lang.String[] { "Name", "Question", });
    internal_static_grpc_example_polling_PollResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_example_polling_PollResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_example_polling_PollResponse_descriptor,
        new java.lang.String[] { "Name", "Question", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
