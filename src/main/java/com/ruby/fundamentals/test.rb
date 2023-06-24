class Test

  def initialize(w,h)
    @width = w
    @height = h
  end

  def printHeight
    puts @height
  end
end

t = Test.new(10,20)

t.printHeight()