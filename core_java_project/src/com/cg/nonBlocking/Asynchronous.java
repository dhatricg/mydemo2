package com.cg.nonBlocking;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Asynchronous {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("a.txt");
		try(AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ)){
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			
			fileChannel.read(buffer, 0, null, new CompletionHandler<Integer, Void>(){

				@Override
				public void completed(Integer result, Void attachment) {
					buffer.flip();
					System.out.println("Read " + result + "bytes.");
					
					byte[] data = new byte[result];
					buffer.get(data);
					System.out.println("File content: " + new String(data));
					
				}

				@Override
				public void failed(Throwable exc, Void attachment) {
					System.err.println("Failed to read: " + exc.getMessage());
					
				}
				
			});
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		
		}

	}

}
