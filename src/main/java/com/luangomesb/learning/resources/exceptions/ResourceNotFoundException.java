package com.luangomesb.learning.resources.exceptions;

/**
 * ResourceNotFoundException
 */
public class ResourceNotFoundException extends RuntimeException {
  public ResourceNotFoundException(Long id) {
    super("Resource no found! Id: " + id);
  }
}