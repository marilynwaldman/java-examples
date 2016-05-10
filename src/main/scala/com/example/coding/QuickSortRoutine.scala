

package com.example.coding

object QuickSortRoutine {

 
           def quicksort(xs: Array[Int]): Array[Int] = {
                   println(" in quicksort")
	            
	           if (xs.length <= 1) xs
	           else {
	                var pivot = xs(0)	                	                
	                Array.concat(
	                     quicksort(xs filter (pivot >)), 
	                        xs filter (pivot ==),
	                     quicksort(xs filter (pivot <)))
	            }
	         
	    }
	             
	        
}